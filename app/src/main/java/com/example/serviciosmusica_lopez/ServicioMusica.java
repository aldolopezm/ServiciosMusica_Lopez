package com.example.serviciosmusica_lopez;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class ServicioMusica extends Service {
    MediaPlayer reproductor;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        Toast.makeText(getApplicationContext(),"Servicio Creado",Toast.LENGTH_SHORT).show();
        reproductor=MediaPlayer.create(getApplicationContext(),R.raw.audio);
    }

}

