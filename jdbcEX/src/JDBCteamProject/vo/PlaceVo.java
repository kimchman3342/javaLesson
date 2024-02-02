package JDBCteamProject.vo;

import lombok.Builder;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class PlaceVo {
    private int place_seq;
    private String name;
    private String phone;
    private int rate;
    private Date open_time;
    private Date close_time;
    private String food_type;

}
