package br.com.boaviagem.boaviagem.calendar;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.services.calendar.Calendar;

/**
 * Created by tawan on 4/23/17.
 */

public class CalendarService {

    private Calendar calendar;
    private String nomeConta;
    public CalendarService(String nomeConta, String tokenAcesso) {
        this.nomeConta = nomeConta;
        GoogleCredential credencial = new GoogleCredential();
        credencial.setAccessToken(tokenAcesso);
    }
}
