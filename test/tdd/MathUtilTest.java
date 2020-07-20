/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static khang.util.MathUtil.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nhat Khang
 */
public class MathUtilTest {
    @Test //báo cho JVM biết rằng đây là hàm main ()
    //Trong hàm này chứa các lệnh để test code chỉnh của mình ở bên MathUtil
    //Ta test các tình huống thành công ở đây 
    //Test 5! nhả về 120
    public void testSuccessfulCase () {
//            assertEquals(30, 50);
            //Tao kỳ vọng có 30 xem mày đưa vào thực tế là bao nhiêu 50 
            // 2 thứ khớp nhau , mày xử lý nhưu dự kiến , đèn xanh , thông thường 
            //không như dự kiến , đèn đỏ là sai 
            assertEquals(120, khang.util.MathUtil.computeFactorial(5));
            assertEquals(1, khang.util.MathUtil.computeFactorial(0));
            assertEquals(1, khang.util.MathUtil.computeFactorial(1));
            assertEquals(2, khang.util.MathUtil.computeFactorial(2));
            // muốn xanh thì tất cả phải màu xanh 
            //nếu tất cả xanh có 1 thằng đỏ thì coi như là đỏ 
            //vì hàm ý : code phải chạy đúng cho mọi tình huống 
            //Ta chỉ cần nhìn vào xanh đỏ 
    }
    @Test (expected = IllegalArgumentException.class) //annotation dấu hiệu báo cho jvm và thư viện jar biết phải làm gì 
    //hàm này chứa các tình huốn cà chớn , vd cf [-5] , cf [16]
    public void testFailedCase () {
        // tao kỳ vọng mày ném ra ngoại lệ thf coi như code này mới ngon , vì -5 không tính được , phải chửi thôi ahihi 
        // ngoại lệ không phải là 1 value để có thể so sánh được nên mình hông có xài assertEquals () được
        //vì hàm này cần 2 value expected và actual 
        //trong khi được ném ra ngoại lệ hok phải là actual value để 
        //ta phải xài chiêu khác khi bắt ngoại lệ coi có đúng là ngoại lệ mình cần hok 
        computeFactorial(-5)  ;
        assertEquals(720, khang.util.MathUtil.computeFactorial(7));
        computeFactorial(16) ; // Vì giai thừa tăng rất nhanh nên không chơi quá 15 //
    }
    //code có thể còn tìm ẩn lỗi nhwung clean and build luôn ra file.jar nếu code không sai cú pháp 
    //vậy thì nguy hiểm quá đi , mình phải disable clean and build nếu code còn màu đỏ 
    //Tức là còn error logic 
    // nhớ 2 con số 1005 NetBeans  8 , 1204 NetBeans 10 trở lên 
    // khi chơi với Ant project 
}
