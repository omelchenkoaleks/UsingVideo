package com.omelchenkoaleks.usingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.video_view);
        // указываем путь к медиа файлу
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demo);

        // чтобы влиять на видео нужен медиа-контролер
        MediaController mediaController = new MediaController(this);
        // метод устанавливает медиа-контролер на видео-вью
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
