import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine().trim(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        bw.write(String.valueOf(A+B));
        br.close();
        bw.flush();
    }
}