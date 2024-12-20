package class8.CompositePatternAndVisitor;

public enum CompositeSortType {
    TITLE_ASC{
        @Override
        int compare(CompositeTask a, CompositeTask b) {
            return b.getTitle().compareTo(a.getTitle());
        }
    },
    DATE_ASC{
        @Override
        int compare(CompositeTask a, CompositeTask b) {
            return b.getDate().compareTo(a.getDate());
        }
    },
    TITLE_DESC{
        @Override
        int compare(CompositeTask a, CompositeTask b) {
            return a.getTitle().compareTo(b.getTitle());
        }
    },
    DATE_DESC{
        @Override
        int compare(CompositeTask a, CompositeTask b) {
            return a.getDate().compareTo(b.getDate());
        }
    };

    abstract int compare(CompositeTask a, CompositeTask b);
}
