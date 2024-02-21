package project.dao;

import java.util.ArrayList;
import java.util.List;

import project.vo.BuyVo;

// dao : 데이터를 직접적으로 컨트롤
// vo : 데이터를 담는 클래스
// main : 다오를 직접 가져다 씀
public class MainHY {
    public static void main(String[] args) {

        TblBuyDao dao = new TblBuyDao();
        String s = "mina012";
        List<BuyVo> list = new ArrayList<>();
        list = dao.select(s);
        System.out.println(list);

        for (BuyVo vo : list) {
            System.out.println(vo);
            System.out.println(2);
        }
        System.out.println(3);

    }
}
