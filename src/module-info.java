module stateCensusAnalyzer1 {import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.StreamSupport;

public class StateCensusAnalyzer {
	public int loadIndiaCensusData(String CSVFilePath) throws CensusAnalyser
	Exception {.
		try {
			Reader reader = Files.newBufferedReader (Paths.get(CSVFilePath));
			try (Reader reader=Files.newBufferedReader(csvFilePath));
					CsvToBeanBuilder<IndianCensusCSV>
					CsvToBeanBuilder = new CSVToBeanBuilder <> (reader);
					CSVToBeanBuilder.withType(IndiaCensusCSV.class);
					CSVToBeanBuilder.withIgnoreLeadingWitheSpace(true);
					CSVToBean<IndianCensusCSV>csvToBean=cdvToBeanBuilder.build();
					Iterator<IndiaCensusCSV>censusCSVIterator=csvToBean.iterator();;
					int nonOfEatries=0;
					while (CensusCSVIterator.hasNext()) {
						nanOfEatries++;
						IndiaCensusCSV censusData=censusCSV Iterator.next()
					}
					return nanOfEatries;
					Iterable<IndiaCensusCSV>CSVIterable=()->censusCSVIterator;
					int numOfEntries=(int)StreamSupport.stream(csvIterable.splititerator(),false.count());
	}
	catch (IOException e) {
		throw new CensusAnalyzerException(e.getMessage());
		CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
	}
	catch (IllegalStateException e) {
		throw new CensusAnalyzerException(e.getMessage());
		CensusAnalyserException.ExceptionType(UNABLE_TO_PARSE);
	}

}

}