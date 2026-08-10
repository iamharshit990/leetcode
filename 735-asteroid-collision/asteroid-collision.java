class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            if (i > 0)
                stack.push(i);
            else {
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(i);
                    continue;
                }
                while (!stack.isEmpty() && stack.peek() > 0) {
                    if (stack.isEmpty() || stack.peek() < 0) {
                        stack.push(i);
                        continue;
                    }
                    if (Math.abs(i) > stack.peek()) {
                        stack.pop();
                        
                    } else if (Math.abs(i) < stack.peek()) {
                        i=0;
                        break;
                    } else {
                        i=0;
                        stack.pop();
                        break;
                    }
                }
                if (i < 0) {
                    stack.push(i);
                }

            }
        }
        int arr[] = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            arr[index++] = stack.pop();
        }
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}