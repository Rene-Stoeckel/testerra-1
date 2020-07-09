/*
 * (C) Copyright T-Systems Multimedia Solutions GmbH 2018, ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Peter Lehmann
 *     pele
 */
package eu.tsystems.mms.tic.testframework.pageobjects.internal.facade;

import eu.tsystems.mms.tic.testframework.pageobjects.UiElement;
import eu.tsystems.mms.tic.testframework.pageobjects.internal.core.GuiElementCore;
import java.awt.Color;

/**
 * It should extend {@link UiElement} in the future,
 * when all of it's features should be decorated.
 */
@Deprecated
public interface GuiElementFacade extends GuiElementCore {
    /**
     * GuiElementCore to GuiElementFacade overrides
     */
    @Override
    GuiElementFacade click();

    @Override
    GuiElementFacade doubleClick();

    @Override
    GuiElementFacade rightClick();

    @Override
    GuiElementFacade highlight(Color color);

    @Override
    GuiElementFacade swipe(int offsetX, int offSetY);

    @Override
    GuiElementFacade select();

    @Override
    GuiElementFacade deselect();

    @Override
    GuiElementFacade type(String text);

    @Override
    GuiElementFacade sendKeys(CharSequence... charSequences);

    @Override
    GuiElementFacade clear();
}
