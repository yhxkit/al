public class Solution2 {
    public static void main(String[] args) {
        System.out.println(cntBit(7));
    }
    public void solution(){

    }
    public static int cntBit(int number) {
        int cnt = 0;
        while (number != 0) {
            cnt += (number & 1);

            System.out.println("number"+number +"="+Integer.toBinaryString(number));
            System.out.println("number&1 = "+cnt);

            number = number >>> 1;
            System.out.println("number changed="+number);
        }
        return cnt;
    }



//int 형 숫자를 하나 입력받아 1인 비트 개수를 세는 매서드를 작성하세요.
//단 Integer.toBinaryString 또는 Interger.toString 함수를 사용하지 않고 구현합니다.
//
//Ex) 입력 7 -> 0111
//결과 : 3
//
//
//public static int countBits(int number){
//
//
//
//
//
//     //이곳에 해당하는 코드를 작성하시요.
//
//
//
//
//
//
//}


}
