/*
 * WorldPainter, a graphical and interactive map generator for Minecraft.
 * Copyright � 2011-2015  pepsoft.org, The Netherlands
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

package org.pepsoft.worldpainter.operations;

import org.pepsoft.worldpainter.MapDragControl;
import org.pepsoft.worldpainter.RadiusControl;
import org.pepsoft.worldpainter.WorldPainterView;
import org.pepsoft.worldpainter.painting.Paint;

/**
 * A radius (brush based) operation which applies a {@link Paint} to the dimension.
 *
 * Created by pepijn on 20-05-15.
 */
public abstract class PaintOperation extends RadiusOperation {
    protected PaintOperation(String name, String description, WorldPainterView view, RadiusControl radiusControl, MapDragControl mapDragControl, int delay, String statisticsKey) {
        super(name, description, view, radiusControl, mapDragControl, delay, statisticsKey);
    }

    protected PaintOperation(String name, String description, WorldPainterView view, RadiusControl radiusControl, MapDragControl mapDragControl, String statisticsKey) {
        super(name, description, view, radiusControl, mapDragControl, statisticsKey);
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
        paintChanged();
    }

    protected void paintChanged() {
        // Do nothing
    }

    private Paint paint;
}