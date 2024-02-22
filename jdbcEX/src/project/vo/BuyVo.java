package project.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class BuyVo {
	private int buy_Idx;
	private String customid;
	private String pcode;
	private int quantity;
	private Date buy_Date;
}
// 필드값이 모두 값으면 equals 로 true 가 되도록 하고싶다.
// -> equals 와 hashcode 를 재정의해야 합니다. (vo 객체)
// -> 이러한 객체는 테스트 과정에서 객체를 비교할 때 사용할 수 있습니다.