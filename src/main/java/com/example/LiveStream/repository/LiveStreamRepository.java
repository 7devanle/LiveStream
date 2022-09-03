package com.example.LiveStream.repository;

import com.example.LiveStream.model.LiveStream;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class LiveStreamRepository {
    List<LiveStream> streams = new ArrayList<>();
    public LiveStreamRepository(){
        streams.add(new LiveStream(UUID.randomUUID().toString(),
                "classes on the  internet",
                "watching how spring boot APIs are created on youtube",
                "https://www.twitch.tv/devanle",
                LocalDateTime.of(2022,05,04, 11,00),
                LocalDateTime.of(2022,05,04, 15,00)));

        streams.add(new LiveStream(UUID.randomUUID().toString(),
                "SpringBoot2.0 APIs",
                "adding a normal description for a project caliber",
                "https://www.twitch.tv/devanle",
                LocalDateTime.of(2022,9,24, 11,00),
                LocalDateTime.of(2022,9,24, 15,00)));


    }
    public List<LiveStream> findAll(){
        return streams;
    }
    public LiveStream findById(String id){
        return streams.stream().filter(stream->stream.id().equals(id)).findFirst().orElse(null);
    }

    public LiveStream create(LiveStream stream){
        streams.add(stream);
        return stream;
    }

    public void update(LiveStream stream, String id){
        LiveStream existing = streams.stream().filter(s -> s.id().equals(id)).
                findFirst().orElseThrow(()->new IllegalArgumentException("Stream not found"));
        int i = streams.indexOf(existing);
        streams.set(i, stream);
    }
    public void delete(String id){
        streams.removeIf(stream -> stream.id().equals(id));
    }

}
