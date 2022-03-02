package FirstClassCollection.without;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoService {
    public static final int LOTTO_NUMBERS_SIZE = 6;

    public void createLottoNumber() throws IllegalAccessException {
        List<Long> lottoNumbers = createNonDuplicateNumbers();
        validateSize(lottoNumbers);
        validateDuplicate(lottoNumbers);

        // *--

    }

    private List<Long> createNonDuplicateNumbers() {
        return null;
    }

    private void validateSize(List<Long> lottoNumbers) throws IllegalAccessException {
        if (lottoNumbers.size() != LOTTO_NUMBERS_SIZE) {
            throw new IllegalAccessException("로또 번호는 6개만 가능합니다.");
        }
    }

    private void validateDuplicate(List<Long> lottoNumbers) throws IllegalAccessException {
        Set<Long> nonDuplicateNumbers = new HashSet<>(lottoNumbers);
        if (nonDuplicateNumbers.size() != LOTTO_NUMBERS_SIZE) {
            throw new IllegalAccessException("로또 번호들은 중복될 수 없습니다.");
        }
    }

}
