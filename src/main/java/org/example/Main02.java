package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main02 {
    static class Point{
        int x;
        int y;
        public Point(int x, int y) {this.x = x; this.y = y;}
    }

    public static void main(String[] args) {
        int[][] g = {{1,1,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,1,1,1},{1,1,0,0,0}};
        System.out.println(bs(g, 0, 0, 4,4));
    }

    public static int bs(int[][] g, int x1, int y1, int x2, int y2){
        Point a = new Point(x1, y1);
        Queue<Point> q = new ArrayDeque<>();
        int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        q.offer(a);
        int cnt = 1;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i < len; i++){
                Point t = q.poll();
                int xx = t.x, yy = t.y;
                g[xx][yy] = 0;
                for(int j = 0; j < 4; j++){
                    int xt = xx + d[j][0];
                    int yt = yy + d[j][1];
                    if(xt >= 0 && yt >= 0 && xt < g.length && yt < g[0].length){
                        if(xt == x2 && yt == y2) {
                            return cnt;
                        }
                        if (g[xt][yt] == 1) {
                            q.offer(new Point(xt, yt));
                        }
                    }
                }
            }
            cnt++;
        }

        return -1;
    }
}
//1,1,1,0,1
//1,0,1,1,1
//1,1,1,0,1
//0,0,1,1,1
//1,1,0,0,1
