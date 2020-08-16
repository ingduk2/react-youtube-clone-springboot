package com.ingduk2.ytclone.service;

import com.ingduk2.ytclone.controller.dto.comments.CommentsDto;
import com.ingduk2.ytclone.controller.dto.comments.GetCommentsDto;
import com.ingduk2.ytclone.controller.dto.user.UserDto;
import com.ingduk2.ytclone.domain.comments.Comments;
import com.ingduk2.ytclone.domain.comments.CommentsRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CommentsService {

    private final CommentsRepository commentsRepository;
    private final UserService userService;

    /**
     * comments 의 id 로는 된다.
     * @param commentsId
     * @return
     */
    public Iterable<Comments> getCommentsAllById(String commentsId){
        List<ObjectId> videoIDs = new ArrayList<>();
        videoIDs.add(new ObjectId(commentsId));
        Iterable<Comments> comments = commentsRepository.findAllById(videoIDs);
        for(Comments comment : comments){
            System.out.println(comment);
        }
        return comments;
    }

    /**
     * repository에 선언하고 PoistId주면 안나온다.
     * @param postId
     * @return
     */
    public Iterable<Comments> getCommentsAllByPostId(String postId){
        List<ObjectId> postIds = new ArrayList<>();
        postIds.add(new ObjectId(postId));
        Iterable<Comments> comments = commentsRepository.findAllByPostId(postIds);
        for(Comments comment : comments){
            System.out.println(comment);
        }
        return comments;
    }

    /**
     *  Jpa 방식으로 하니까 된다. springdata 라서 같은것 같다.
     *  writer 와 populate 시켜줘야한다.
     *  안되니 수동으로
     */
    public GetCommentsDto getCommentsByPostId(String postId){
        List<CommentsDto> comments = commentsRepository.findAllByPostId(new ObjectId(postId))
                .stream().map(comment -> {
                    UserDto user = new UserDto(userService.findById(comment.getWriter()));
                    return new CommentsDto(comment, user);
                }).collect(Collectors.toList());

        return new GetCommentsDto(true, comments);
    }


}
