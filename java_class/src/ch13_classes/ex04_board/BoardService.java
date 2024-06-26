package ch13_classes.ex04_board;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

    public void save() {
        System.out.print("제목: ");
        String boardTitle = scanner.next();
        System.out.print("작성자: ");
        String boardWriter = scanner.next();
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();
        System.out.print("내용: ");
        String boardContents = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardPass, boardContents);
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("글작성 완료");
        } else {
            System.out.println("글작성 실패");
        }
    }

    public void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();
        listPrint(boardDTOList);
    }

    public void findById() {
        System.out.println("조회 id: ");
        long id = scanner.nextLong();
        // 조회수 증가
        boolean result = boardRepository.updateHits(id);
        // 게시글 내용 가져와서 출력
        if (result) {
            BoardDTO boardDTO = boardRepository.findById(id);
            System.out.println("boardDTO = " + boardDTO);
        } else {
            System.out.println("요청하신 게시글은 존재하지 않습니다!");
        }
    }

    public void update() {
        System.out.print("수정할 id: ");
        long id = scanner.nextLong();
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();
        BoardDTO boardDTO = boardRepository.findById(id);
        // 게시글 확인
        if (boardDTO != null) {
            // 비밀번호 검증
            if (boardPass.equals(boardDTO.getBoardPass())) {
                // 비밀번호가 맞으면 수정할 제목, 내용을 입력받고 수정처리
                System.out.print("수정 제목: ");
                String boardTitle = scanner.next();
                System.out.print("수정 내용: ");
                String boardContents = scanner.next();
                boolean result = boardRepository.update(id, boardTitle, boardContents);
                if (result) {
                    System.out.println("수정 완료");
                } else {
                    System.out.println("수정 실패");
                }
            } else {
                System.out.println("비밀번호가 일치하지 않습니다!");
            }
        } else {
            System.out.println("요청하신 게시글은 존재하지 않습니다!");
        }
    }

    public void delete() {
        System.out.print("수정할 id: ");
        long id = scanner.nextLong();
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            if (boardPass.equals(boardDTO.getBoardPass())) {
                boolean result = boardRepository.delete(id);
                if (result) {
                    System.out.println("삭제 완료");
                } else {
                    System.out.println("삭제 실패");
                }
            } else {
                System.out.println("비밀번호가 일치하지 않습니다!");
            }
        } else {
            System.out.println("요청하신 게시글은 존재하지 않습니다!");
        }
    }

    public void search() {
        System.out.print("검색어: ");
        String q = scanner.next();
        List<BoardDTO> searchList = boardRepository.search(q);
        if (searchList.size() > 0) {
            listPrint(searchList);
        } else {
            System.out.println("검색결과가 없습니다!");
        }
    }

    public void testData() {
        for (int i = 1; i < 11; i++) {
            BoardDTO boardDTO = new BoardDTO("title" + i, "writer" + i, "1234", "contents" + i);
            boardRepository.save(boardDTO);
        }
    }

    // 목록 출력 전용 메서드
    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t" + "date\t");
        for (BoardDTO boardDTO: boardDTOList) {
            System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() + "\t" +
                    boardDTO.getBoardWriter() + "\t" + boardDTO.getBoardHits() + "\t" +
                    boardDTO.getCreatedAt() + "\t");
        }
    }
}
















