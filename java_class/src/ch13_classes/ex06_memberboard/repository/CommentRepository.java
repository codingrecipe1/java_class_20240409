package ch13_classes.ex06_memberboard.repository;

import ch13_classes.ex06_memberboard.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private static List<CommentDTO> commentDTOList = new ArrayList<>();
    private static long commentId = 1L;

    public boolean save(CommentDTO commentDTO) {
        commentDTO.setId(commentId++);
        return commentDTOList.add(commentDTO);
    }

    public List<CommentDTO> findAll(long boardId) {
        List<CommentDTO> commentDTOS = new ArrayList<>();
        for (int i = 0; i < commentDTOList.size(); i++) {
            if (boardId == commentDTOList.get(i).getBoardId()) {
                commentDTOS.add(commentDTOList.get(i));
            }
        }
        return commentDTOS;
    }
}
