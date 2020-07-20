/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khang.util;

/**
 *
 * @author Nhat Khang
 */
//đây là class chứa các hàm toán học tính toán với mục tiêu sẽ xài chung cho các nơi khác 
//// phàm cái gì mang tính xài chung ta sẽ xài static 
public class MathUtil {
    //tính n!= 1*2*3*...n Vì n! tăng giá trị rất nhanh , sớm tràn miền int 
    //int chỉ xài tối đa 2 tỷ 1 nên ta xài long mới an toàn 
    //thực ra 15! đã to lắm rồi nên ta chỉ tính giai thừa từ 15 trở lại
    // 
    public static long computeFactorial (int n) {
        if (n < 0) 
            throw new IllegalArgumentException("Invalid input . N must be >= 0 ");
       long result = 1 ;
       for (int i = 1 ; i <= n ; i ++) {
           result *= i ;      
       }
       return result ;
    }
}
