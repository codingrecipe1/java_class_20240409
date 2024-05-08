package ch13_classes.ex06_memberboard.repository;

import ch13_classes.ex06_memberboard.dto.BoardDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardRepository {
    Scanner scanner = new Scanner(System.in);
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
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id == boardDTOList.get(i).getId()) {
                int hits = boardDTOList.get(i).getBoardHits();
                hits = hits + 1;
                boardDTOList.get(i).setBoardHits(hits);
                return true;
            }
        }
        return false;
    }

    public BoardDTO findById(long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id == boardDTOList.get(i).getId()) {
                return boardDTOList.get(i);
            }
        }
        return null;
    }

    public boolean update(long id, String boardTitle, String boardContents) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id == boardDTOList.get(i).getId()) {
                boardDTOList.get(i).setBoardTitle(boardTitle);
                boardDTOList.get(i).setBoardContents(boardContents);
                return true;
            }
        }
        return false;
    }

    public boolean delete(long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id == boardDTOList.get(i).getId()) {
                boardDTOList.remove(i);
                return true;
            }
        }
        return false;
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
