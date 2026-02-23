int count = 0;

        for (String p : patterns) {
            if (word.contains(p)) {
                count++;
            }
        }

        return count;
