package project.dao;

import java.util.Date;

import project.vo.BuyVo;

// dao : 데이터를 직접적으로 컨트롤
// vo : 데이터를 담는 클래스
// main : 다오를 직접 가져다 씀
public class MainHY {
    TblBuyDao dao = new TblBuyDao();
    Date ddd =  new Date();
    BuyVo vo = new BuyVo(0, "kimchman", "kkkkkk", 4, null)

    dao.insert1();
}
