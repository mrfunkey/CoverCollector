package com.example.covercollector;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArtworkController {
    private final RestClient restClient = RestClient.create();
    private final ObjectMapper mapper = new ObjectMapper();

    @GetMapping("/api/album")
    public ResponseEntity<?> getAlbumCover(@RequestParam String artist, @RequestParam String album) {

        String searchTerm = artist + " " + album;
        String url = "https://itunes.apple.com/search?term=" + searchTerm + "&entity=album&limit=3";
        String json = restClient.get().uri(url).retrieve().body(String.class);
        JsonNode root = mapper.readTree(json);

        JsonNode results = root.path("results");
        if (results.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        List<AlbumCover> albumCovers = new ArrayList<>();
        for (JsonNode result: results) {
            String artistName =  result.path("artistName").asString();
            String albumName = result.path("collectionName").asString();
            String releaseDate = result.path("releaseDate").asString().substring(0, 4);
            String lowResURL = result.path("artworkUrl100").asString();
            String highResURL = lowResURL.replace("100x100bb.jpg", "3000x3000bb.jpg");


        }

        return null;
    }

}
