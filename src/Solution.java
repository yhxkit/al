

public class Solution {
    // 주어진 가격정보의 배열에서 찾고자 하는 가격의 배열인덱스를 반환하는 함수를 구현하세요.
//    시간복잡도가 최상인 방법 (실행시간이 가장 낮은 방법) 으로 구현하세요.
//    단 Java에서 기본으로 제공되는 Util 함수를 사용하지 않고 직접 구현합니다.
//
//    단 아래의 조건을 가정합니다.
//    숫자배열은 오름차순으로 정렬되어 있음
//
//    ex> {1000,2000,3000,4000,....4000000}


    public static void main(String[] args) {
        int priceCount = 4000;

        // 가격정보 배열
        int[] priceArray = new int[priceCount];
        for (int priceArrayIdx = 1; priceArrayIdx < priceCount; priceArrayIdx++) {
            priceArray[priceArrayIdx - 1] = priceArrayIdx * 1000;
        }
        System.out.println("가격의 배열인덱스 : " + getSearchPriceArrayIntex(priceArray, 690000));

    }

    public static int getSearchPriceArrayIntex(int[] priceArray, int searchPrice) {
        int low = 0;
        int high = priceArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = priceArray[mid];

            //찾고자 하는 값이 중간요소 보다 큰경우
            if (midVal < searchPrice) {
                low = mid + 1;
                //찾고자 하는 값이 중간요소 보다 작은경우
            } else if (midVal > searchPrice) {
                high = mid - 1;
            } else {
                return mid; // key found
            }
        }
        return -1; // key not found.


    }


}
