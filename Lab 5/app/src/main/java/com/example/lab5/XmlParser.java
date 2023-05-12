package com.example.lab5;

import android.widget.TextView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XmlParser {

    public static String getRateFromECB(InputStream stream, String currencyCode) throws IOException {
        String result = "";
        try {
            DocumentBuilderFactory xmlDocFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder xmlDocBuilder = xmlDocFactory.newDocumentBuilder();
            Document doc = xmlDocBuilder.parse(stream);

            NodeList list1 = doc.getElementsByTagName(Constants.STATS_DATE);
            for (int i = 0; i < list1.getLength(); ++i) {
                Node nNode = list1.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;
                    result = "\n" + "Date Currency Data: " + element.getAttribute("Date") + "\n" + "\n";
                }
            }

            NodeList list2 = doc.getElementsByTagName(Constants.CURRENCY);
            for (int i = 0; i < list2.getLength(); ++i) {
                Node nNode = list2.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;
                    result = result + element.getElementsByTagName("CharCode").item(0).getTextContent() + " - " + element.getElementsByTagName("Name").item(0).getTextContent() + " - " + element.getElementsByTagName("Value").item(0).getTextContent() + "\n";
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return result;
    }
}
