/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a,b) -> Integer.compare(a.start, b.start));

        List<Interval> stack = new ArrayList<>();
        for(Interval i : intervals){
            if(!stack.isEmpty()){
                Interval last = stack.get(stack.size()-1);
                boolean overlapp = i.start > last.start && i.end < last.end;
                if(overlapp) return false;
                if((i.start > last.start && i.end < last.end) || last.end > i.start)
                    return false;
            } 
            stack.add(i);
        }
        return true;
    }
}
