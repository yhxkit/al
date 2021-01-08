import java.util.*;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        String[] g = {"classic", "pop", "classic", "classic", "pop"};
        int[] p = {500, 600, 150, 800, 2500};

        for(int a : t.solution(g,p)){
            System.out.println(a);
        }

    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        //장르별 재생횟수
        Map<String, Integer> pByg = new HashMap();
        List<Music> musics = new ArrayList<>();

        for(int i =0 ; i<genres.length; i++){
            musics.add(new Music(i, genres[i], plays[i]));
            if(pByg.containsKey(genres[i])){
                pByg.put(genres[i], pByg.get(genres[i])+plays[i]);
            }else{
                pByg.put(genres[i], plays[i]);
            }
        }

        List<Map.Entry<String,Integer>> list = new LinkedList<>(pByg.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

      //  System.out.println(list);
        musics.sort((o1, o2) -> o2.getPlay()-o1.getPlay());


        musics.stream().forEach(m-> System.out.println(m.genre+m.getPlay()));

        for(Map.Entry<String, Integer> m : pByg.entrySet()){

        }

        musics.stream().forEach(m-> System.out.println(m.genre+m.getPlay()));

        answer = musics.stream().mapToInt(m->m.getI()).toArray();
        return answer;
    }

    class Music{
        int i;
        String genre;
        int play;

        public Music(int i, String genre, int play){
            this.i = i;
            this.genre = genre;
            this.play = play;
        }

        public int getI() {
            return i;
        }

        public int getPlay() {
            return play;
        }

        public String getGenre() {
            return genre;
        }
    }
}
