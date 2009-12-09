/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.engine.xml;

import net.sf.jasperreports.engine.design.JasperDesign;

import org.xml.sax.Attributes;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public class JasperDesignFactory extends JRBaseFactory
{

	
	/**
	 *
	 */
	public Object createObject(Attributes atts)
	{
		JasperDesign jasperDesign = new JasperDesign();
		
		jasperDesign.setName(atts.getValue(JRXmlConstants.ATTRIBUTE_name));

		jasperDesign.setLanguage(atts.getValue(JRXmlConstants.ATTRIBUTE_language));
		
		String columnCount = atts.getValue(JRXmlConstants.ATTRIBUTE_columnCount);
		if (columnCount != null && columnCount.length() > 0)
		{
			jasperDesign.setColumnCount(Integer.parseInt(columnCount));
		}

		Byte printOrder = (Byte)JRXmlConstants.getPrintOrderMap().get(atts.getValue(JRXmlConstants.ATTRIBUTE_printOrder));
		if (printOrder != null)
		{
			jasperDesign.setPrintOrder(printOrder.byteValue());
		}

		String pageWidth = atts.getValue(JRXmlConstants.ATTRIBUTE_pageWidth);
		if (pageWidth != null && pageWidth.length() > 0)
		{
			jasperDesign.setPageWidth(Integer.parseInt(pageWidth));
		}
		
		String pageHeight = atts.getValue(JRXmlConstants.ATTRIBUTE_pageHeight);
		if (pageHeight != null && pageHeight.length() > 0)
		{
			jasperDesign.setPageHeight(Integer.parseInt(pageHeight));
		}

		Byte orientation = (Byte)JRXmlConstants.getOrientationMap().get(atts.getValue(JRXmlConstants.ATTRIBUTE_orientation));
		if (orientation != null)
		{
			jasperDesign.setOrientation(orientation.byteValue());
		}

		Byte whenNoDataType = (Byte)JRXmlConstants.getWhenNoDataTypeMap().get(atts.getValue(JRXmlConstants.ATTRIBUTE_whenNoDataType));
		if (whenNoDataType != null)
		{
			jasperDesign.setWhenNoDataType(whenNoDataType.byteValue());
		}

		String columnWidth = atts.getValue(JRXmlConstants.ATTRIBUTE_columnWidth);
		if (columnWidth != null && columnWidth.length() > 0)
		{
			jasperDesign.setColumnWidth(Integer.parseInt(columnWidth));
		}

		String columnSpacing = atts.getValue(JRXmlConstants.ATTRIBUTE_columnSpacing);
		if (columnSpacing != null && columnSpacing.length() > 0)
		{
			jasperDesign.setColumnSpacing(Integer.parseInt(columnSpacing));
		}

		String leftMargin = atts.getValue(JRXmlConstants.ATTRIBUTE_leftMargin);
		if (leftMargin != null && leftMargin.length() > 0)
		{
			jasperDesign.setLeftMargin(Integer.parseInt(leftMargin));
		}

		String rightMargin = atts.getValue(JRXmlConstants.ATTRIBUTE_rightMargin);
		if (rightMargin != null && rightMargin.length() > 0)
		{
			jasperDesign.setRightMargin(Integer.parseInt(rightMargin));
		}

		String topMargin = atts.getValue(JRXmlConstants.ATTRIBUTE_topMargin);
		if (topMargin != null && topMargin.length() > 0)
		{
			jasperDesign.setTopMargin(Integer.parseInt(topMargin));
		}

		String bottomMargin = atts.getValue(JRXmlConstants.ATTRIBUTE_bottomMargin);
		if (bottomMargin != null && bottomMargin.length() > 0)
		{
			jasperDesign.setBottomMargin(Integer.parseInt(bottomMargin));
		}

		String isTitleNewPage = atts.getValue(JRXmlConstants.ATTRIBUTE_isTitleNewPage);
		if (isTitleNewPage != null && isTitleNewPage.length() > 0)
		{
			jasperDesign.setTitleNewPage(Boolean.valueOf(isTitleNewPage).booleanValue());
		}

		String isSummaryNewPage = atts.getValue(JRXmlConstants.ATTRIBUTE_isSummaryNewPage);
		if (isSummaryNewPage != null && isSummaryNewPage.length() > 0)
		{
			jasperDesign.setSummaryNewPage(Boolean.valueOf(isSummaryNewPage).booleanValue());
		}

		String isSummaryWithPageHeaderAndFooter = atts.getValue(JRXmlConstants.ATTRIBUTE_isSummaryWithPageHeaderAndFooter);
		if (isSummaryWithPageHeaderAndFooter != null && isSummaryWithPageHeaderAndFooter.length() > 0)
		{
			jasperDesign.setSummaryWithPageHeaderAndFooter(Boolean.valueOf(isSummaryWithPageHeaderAndFooter).booleanValue());
		}

		String isFloatColumnFooter = atts.getValue(JRXmlConstants.ATTRIBUTE_isFloatColumnFooter);
		if (isFloatColumnFooter != null && isFloatColumnFooter.length() > 0)
		{
			jasperDesign.setFloatColumnFooter(Boolean.valueOf(isFloatColumnFooter).booleanValue());
		}

		jasperDesign.setScriptletClass(atts.getValue(JRXmlConstants.ATTRIBUTE_scriptletClass));
		jasperDesign.setFormatFactoryClass(atts.getValue(JRXmlConstants.ATTRIBUTE_formatFactoryClass));
		jasperDesign.setResourceBundle(atts.getValue(JRXmlConstants.ATTRIBUTE_resourceBundle));

		Byte whenResourceMissingType = (Byte)JRXmlConstants.getWhenResourceMissingTypeMap().get(atts.getValue(JRXmlConstants.ATTRIBUTE_whenResourceMissingType));
		if (whenResourceMissingType != null)
		{
			jasperDesign.setWhenResourceMissingType(whenResourceMissingType.byteValue());
		}

		String isIgnorePagination = atts.getValue(JRXmlConstants.ATTRIBUTE_isIgnorePagination);
		if (isIgnorePagination != null && isIgnorePagination.length() > 0)
		{
			jasperDesign.setIgnorePagination(Boolean.valueOf(isIgnorePagination).booleanValue());
		}

		return jasperDesign;
	}
	

}
