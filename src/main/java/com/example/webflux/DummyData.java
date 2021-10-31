package com.example.webflux;

import com.example.webflux.documents.Playlist;
import com.example.webflux.repositories.PlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

//@Component
//public class DummyData implements CommandLineRunner {
//
//    private final PlaylistRepository playlistRepository;
//
//    public DummyData(PlaylistRepository playlistRepository) {
//        this.playlistRepository = playlistRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        playlistRepository.deleteAll().thenMany(
//                Flux.just("Api rest Spring Boot", "Deploy semanal", "Lógica de programação")
//                        .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//                        .flatMap(playlistRepository::save))
//                        .subscribe(System.out::println);
//
//    }
//}
