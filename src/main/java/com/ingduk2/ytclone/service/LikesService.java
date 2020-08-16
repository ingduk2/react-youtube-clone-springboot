package com.ingduk2.ytclone.service;

import com.ingduk2.ytclone.controller.dto.likes.DisLikeDto;
import com.ingduk2.ytclone.controller.dto.likes.GetDisLikeDto;
import com.ingduk2.ytclone.controller.dto.likes.GetLikesDto;
import com.ingduk2.ytclone.controller.dto.likes.LikeDto;
import com.ingduk2.ytclone.domain.likes.DisLikeRepository;
import com.ingduk2.ytclone.domain.likes.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class LikesService {

    private final LikeRepository likeRepository;
    private final DisLikeRepository disLikeRepository;

    /**
     * like find all by videoId
     * @param videoId
     * @return
     */
    public GetLikesDto likeFindByVideoId(String videoId) {
        List<LikeDto> likeDtos = likeRepository.findAllByVideoId(new ObjectId(videoId))
                .stream().map(LikeDto::new).collect(Collectors.toList());
        return new GetLikesDto(true, likeDtos);
    }

    /**
     * like find all by commentId
     * @param commentId
     * @return
     */
    public GetLikesDto likefindByCommentId(String commentId) {
        List<LikeDto> likeDtos = likeRepository.findAllByCommentId(new ObjectId(commentId))
                .stream().map(LikeDto::new).collect(Collectors.toList());
        return new GetLikesDto(true, likeDtos);
    }

    /**
     * dislike find all by videoId
     * @param videoId
     * @return
     */
    public GetDisLikeDto disLikefindByVideoId(String videoId) {
        List<DisLikeDto> disLikeDtos = disLikeRepository.findAllByVideoId(new ObjectId(videoId))
                .stream().map(DisLikeDto::new).collect(Collectors.toList());
        return new GetDisLikeDto(true, disLikeDtos);
    }

    /**
     * dislike find all by commentId
     * @param commentId
     * @return
     */
    public GetDisLikeDto disLikefindByCommentId(String commentId) {
        List<DisLikeDto> disLikeDtos = disLikeRepository.findAllByCommentId(new ObjectId(commentId))
                .stream().map(DisLikeDto::new).collect(Collectors.toList());

        return new GetDisLikeDto(true, disLikeDtos);
    }

}
