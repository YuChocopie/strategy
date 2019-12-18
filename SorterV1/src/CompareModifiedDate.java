public class CompareModifiedDate implements Comparable<FileInfo> {
    @Override
    public int compareTo(FileInfo f1, FileInfo f2) {
        return f1.getModifiedDate().compareTo(f2.getModifiedDate());
    }
}
