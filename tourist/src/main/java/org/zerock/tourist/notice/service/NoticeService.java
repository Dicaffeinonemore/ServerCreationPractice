package org.zerock.tourist.notice.service;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.zerock.tourist.notice.dao.NoticeDAO;
import org.zerock.tourist.notice.domain.NoticeVO;
import org.zerock.tourist.notice.dto.NoticeDTO;
import org.zerock.tourist.notice.dto.PageRequestDTO;
import org.zerock.tourist.notice.dto.PageResponseDTO;
import org.zerock.tourist.util.MapperUtil;

import java.util.List;
import java.util.stream.Collectors;
@Log4j2
public enum NoticeService {
  INSTANCE;
  private NoticeDAO dao;
  private ModelMapper modelMapper;
  NoticeService(){
    dao = new NoticeDAO();
    modelMapper = MapperUtil.INSTANCE.getModelMapper();
  }
  public List<NoticeDTO> getNoticeList() throws Exception{
    List<NoticeVO> voList = dao.selectNoticeList();
    List<NoticeDTO> dtoList = voList.stream()
        .map(vo -> modelMapper.map(vo, NoticeDTO.class))
        .collect(Collectors.toList());
    return dtoList;
  }
  public NoticeDTO getNotice(int tno) throws Exception{
    NoticeVO vo = dao.selectNotice(tno);
    return modelMapper.map(vo, NoticeDTO.class);
  }
  public void addNotice(NoticeDTO dto) throws Exception{
    NoticeVO vo = modelMapper.map(dto, NoticeVO.class);
    dao.insertNotice(vo);
  }
  public void removeNotice(int tno) throws Exception{
    dao.removeNotice(tno);
  }
  public  void modifyNotice(NoticeDTO tno) throws Exception{
    NoticeVO vo = modelMapper.map(tno,NoticeVO.class);
    log.info(vo);
    dao.updateNotice(vo);
  }
  public List<NoticeDTO> listAll(PageRequestDTO pageRequestDTO) throws Exception {
    //데이터베이스에서 tbl_todo의 모든 데이터를 취득
    List<NoticeVO> voList = dao.selectNoticeList();
    log.info("voList...............");
    log.info(voList);
    List<NoticeDTO> dtoList = voList.stream()
            .map(vo -> modelMapper.map(vo, NoticeDTO.class))
            .collect(Collectors.toList());
    PageResponseDTO<NoticeDTO> pageResponseDTO = PageResponseDTO.<NoticeDTO>withAll()
            .pageRequestDTO(pageRequestDTO)
            .dtoList(dtoList)
            .total(getOne)
            .build();
    return dtoList;
  }

}










