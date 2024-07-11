package com.example.todolist.config;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class AppConfig {

  public void enviarWhatsapp() {
    RestTemplate restTemplate1 = new RestTemplate();
    String url = "http://149.18.51.246:30780/message/sendText/inforvix-sistemas-0343";
    String body = """
            {
                "number": "27992841161",
                "options": {
                    "delay": 1200,
                    "presence": "composing",
                    "linkPreview": false
                },
                "textMessage": {
                    "text": "TESTE DE CONSUMO"
                }
            }
            """;
    HttpHeaders headers = new HttpHeaders();
    headers.set("apiKey", "B6D711FCDE4D4FD5936544120E713976");
    headers.set("Content-Type", "application/json");

    HttpEntity<String> entity = new HttpEntity<>(body, headers);
    restTemplate1.exchange(url, HttpMethod.POST, entity, String.class);
  }
}
