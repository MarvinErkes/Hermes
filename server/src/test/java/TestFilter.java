/*
 * Copyright (c) 2017 "Marvin Erkes"
 *
 * This file is part of Hermes.
 *
 * Hermes is free software: you can redistribute it and/or modify
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

import de.progme.hermes.server.filter.FilteredRequest;
import de.progme.hermes.server.filter.RequestFilter;
import de.progme.hermes.shared.Status;
import de.progme.hermes.shared.http.Response;

/**
 * Created by Marvin Erkes on 31.01.2016.
 */
public class TestFilter implements RequestFilter {

    @Override
    public void filter(FilteredRequest request) {

        if (request.header("X-Test") != null)
            request.abortWith(Response.status(Status.FORBIDDEN).build());
    }
}
