package ch13_classes.ex04_board;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    private static List<BoardDTO> boardDTOList = new ArrayList<>();
    private static long boardId = 1L;

    public boolean save(BoardDTO boardDTO) {
        boardDTO.setId(boardId++);
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardDTOList;
    }

    public boolean updateHits(long id) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id == boardDTOList.get(i).getId()) {
                // 기존 조회수 값 가져오기
                int hits = boardDTOList.get(i).getBoardHits();
                // 1증가
                hits = hits + 1;
                // 조회수 필드로 다시 저장
                boardDTOList.get(i).setBoardHits(hits);
                result = true;
            }
        }
        return result;
    }

    public BoardDTO findById(long id) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id == boardDTOList.get(i).getId()) {
                boardDTO = boardDTOList.get(i);
            }
        }
        return boardDTO;
    }

    public boolean update(long id, String boardTitle, String boardContents) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id == boardDTOList.get(i).getId()) {
                boardDTOList.get(i).setBoardTitle(boardTitle);
                boardDTOList.get(i).setBoardContents(boardContents);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(long id) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id == boardDTOList.get(i).getId()) {
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public List<BoardDTO> search(String q) {
        List<BoardDTO> searchList = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(q)) {
                searchList.add(boardDTOList.get(i));
            }
        }
        return searchList;
    }
}












