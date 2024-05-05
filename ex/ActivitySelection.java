package ex;

public class ActivitySelection {
    // Prints a maximum set of activities that can be done
    // by a single person, one at a time.
    public static void selectActivities( int s[], int f[], int n ) {
        int i, j;

        System.out.println("Following activities are selected:");

        // Hoạt động đầu tiên luôn được chọn
        i = 0;
        System.out.print(i + " ");

        // Đối với các hoạt động còn lại
        for (j = 1; j < n; j++) {
            // Nếu thời điểm bắt đầu của hoạt động j lớn hơn hoặc bằng thời điểm kết thúc của hoạt động i
            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }

    }
}


class ActivitySelectionRunner {
    public static void main( String[] args ) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int finish[] = { 2, 4, 6, 7, 9, 9 };
        int n = start.length;

        // Function call
        ActivitySelection.selectActivities( start, finish, n );
    }
}
