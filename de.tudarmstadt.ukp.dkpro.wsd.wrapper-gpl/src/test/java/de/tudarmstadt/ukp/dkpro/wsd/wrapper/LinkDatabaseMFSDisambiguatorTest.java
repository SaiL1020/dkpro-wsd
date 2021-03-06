/**
 * Copyright 2016
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.tudarmstadt.ukp.dkpro.wsd.wrapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class LinkDatabaseMFSDisambiguatorTest {

	@Test
	@Ignore
	public void disambiguateTest() throws IOException {
		String input = "Please disambiguate this text.";
		
		Disambiguator disambiguator = new LinkDatabaseMFSDisambiguator();
		List<String> senses = disambiguator.disambiguate(input);
		System.out.println(senses);

		List<String> goldSenses = new ArrayList<String>();
		goldSenses.add("word_sense_disambiguation");
		goldSenses.add("text_user_interface");
		
		assertEquals(goldSenses.size(), senses.size());
		for(String sense : senses){
			assertTrue(goldSenses.contains(sense));
		}
	}
}
