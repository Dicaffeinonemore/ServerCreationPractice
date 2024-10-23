package org.zerock.tourist.member.service;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.zerock.tourist.member.dao.MemberDAO;
import org.zerock.tourist.member.domain.MemberVO;
import org.zerock.tourist.member.dto.MemberDTO;
import org.zerock.tourist.util.MapperUtil;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public enum MemberService {
    INSTANCE;
    private MemberDAO dao;
    private ModelMapper modelMapper;
    MemberService(){
        dao= new MemberDAO();
        modelMapper = MapperUtil.INSTANCE.getModelMapper();
    }
    public List<MemberDTO> getMemberList() throws Exception{
        List<MemberVO> voList = dao.memberVOList();
        List<MemberDTO> dtoList = voList.stream()
                .map(vo -> modelMapper.map(vo, MemberDTO.class))
                .collect(Collectors.toList());
        return dtoList;
    }
    public void addMember(MemberDTO dto) throws Exception{
        MemberVO vo = modelMapper.map(dto, MemberVO.class);
        dao.insertMember(vo);
    }
    public MemberDTO login(String mid, String mpw) throws Exception {
        MemberVO vo = dao.getWithPassword(mid, mpw);
        MemberDTO dto = modelMapper.map(vo, MemberDTO.class);
        return dto;
    }
}
