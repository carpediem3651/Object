package class8.CompositePatternAndVisitor;

public enum SortType {
    TITLE_ASC{
        @Override
        int compare(Task a, Task b) {
            return b.getTitle().compareTo(a.getTitle());
        }
    },
    DATE_ASC{
        @Override
        int compare(Task a, Task b) {
            return b.getDate().compareTo(a.getDate());
        }
    },
    TITLE_DESC{
        @Override
        int compare(Task a, Task b) {
            return a.getTitle().compareTo(b.getTitle());
        }
    },
    DATE_DESC{
        @Override
        int compare(Task a, Task b) {
            return a.getDate().compareTo(b.getDate());
        }
    };

    abstract int compare(Task a, Task b);
}
