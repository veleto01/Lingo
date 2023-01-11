package urjc.poo.lingo.Clases;

import java.util.Comparator;

public class ComparatorRankingV implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Usuario u1 = (Usuario) o1;
        Usuario u2 = (Usuario) o2;
        return u2.getGanadas() - u1.getGanadas();
    }
}
