package com.ms.user.producers;

import com.ms.user.dtos.NotificationDto;
import com.ms.user.models.UserModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {

    final RabbitTemplate rabbitTemplate;

    public UserProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value(value = "${broker.queue.notification.name}")
    private String routingKey;


    public void publishMessageNotification(UserModel userModel, String subject, String text) {
        var emailDto = new NotificationDto();
        emailDto.setUserId(userModel.getUserId());
        emailDto.setEmailTo(userModel.getEmail());
        emailDto.setSubject(subject);
        emailDto.setText(text);

        emailDto.setEmailTo("olavobelfort.contato@gmail.com");

        rabbitTemplate.convertAndSend("", routingKey, emailDto);
    }

}
