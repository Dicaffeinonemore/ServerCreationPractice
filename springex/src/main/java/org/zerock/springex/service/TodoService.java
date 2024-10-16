package org.zerock.springex.service;
import org.zerock.springex.dto.*;

import java.util.List;

public interface TodoService {
    void register(TodoDTO todoDTO);
    List<TodoDTO> getAll();
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);
    TodoDTO getOne(Long tno);
    void remove(Long tno);
    void modify(TodoDTO todoDTO);
}
