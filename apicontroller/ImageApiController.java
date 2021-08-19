package com.healthyapplication.healthyapplication.apicontroller;

import com.healthyapplication.healthyapplication.domain.Image;
import com.healthyapplication.healthyapplication.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ImageApiController {

    private final ImageService imageService;

    // 생성
    @PostMapping("/api/image/insert")
    public void insert (@RequestBody Image image) {
        imageService.save(image);
    }

    // 회원에 저장
    @PostMapping("/api/image/{member_id}/{image_id}/insert")
    public void save(@PathVariable Long image_id, @PathVariable String member_id){
        imageService.update(image_id, member_id);
    }


}