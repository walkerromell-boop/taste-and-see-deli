# Taste & See Deli
Java Console-Based Ordering System

Taste & See Deli is a Java console application that allows users to build custom sandwiches, choose signature sandwiches, add drinks and chips, and generate receipts. It demonstrates strong object-oriented design, file handling, and menu navigation.

Features
Custom Sandwich Builder

## Users can choose:

Bread type and size

Toasted or not

Meats and cheeses (with optional extra portions)

Toppings and sauces

## Signature Sandwiches

Includes:

The OG – a preset Italian-style sandwich

Cookie Sandwich – a preset dessert sandwich

Users can modify signature sandwiches by adding or removing ingredients.

Drinks and Chips

Simple menus allow adding drink name/size and chip selection.

## Order Summary

Users can view a full itemized summary at any time.
<img width="1860" height="1002" alt="Screenshot 2025-11-14 at 8 03 01 AM" src="https://github.com/user-attachments/assets/f44a54b2-8323-4430-9503-34de19ab037d" />

[Taste&See.drawio](https://github.com/user-attachments/files/23548733/Taste.See.drawio)<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36" version="28.2.9">
  <diagram name="Page-1" id="2Q5HwwS3wVmEkE7bjT1T">
    <mxGraphModel dx="1649" dy="1850" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="Wyr9WAor4eIPkShxo9wc-1" value="UserInterface" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="610" y="-40" width="160" height="60" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-2" value="+ start: ()" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-1">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-3" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-1">
          <mxGeometry y="52" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-5" value="order" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="40" y="120" width="180" height="220" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-6" value="- toppings: List&amp;lt;&amp;gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-5">
          <mxGeometry y="26" width="180" height="26" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-7" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-5">
          <mxGeometry y="52" width="180" height="8" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-8" value="&lt;div&gt;+addSandwich(s: Sandwich): void&amp;nbsp;&lt;/div&gt;&lt;div&gt;&amp;nbsp;+addDrink( Drink): void&amp;nbsp; &amp;nbsp; &amp;nbsp; &amp;nbsp;&lt;/div&gt;&lt;div&gt;&amp;nbsp;+addChips( Chips): void&amp;nbsp; &amp;nbsp; &amp;nbsp;&amp;nbsp;&lt;/div&gt;&lt;div&gt;&amp;nbsp;+getOrderSummary(): String&amp;nbsp;&amp;nbsp;&lt;/div&gt;&lt;div&gt;+getVaule&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-5">
          <mxGeometry y="60" width="180" height="160" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-39" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;" edge="1" parent="1" source="Wyr9WAor4eIPkShxo9wc-9" target="Wyr9WAor4eIPkShxo9wc-33">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-9" value="Sandwich" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="650" y="90" width="260" height="218" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-10" value="&lt;div&gt;-breadSize: int&amp;nbsp;&lt;/div&gt;&lt;div&gt;-name: String&amp;nbsp;&lt;/div&gt;&lt;div&gt;&amp;nbsp;-name: String&amp;nbsp; &amp;nbsp;&lt;/div&gt;&lt;div&gt;-breadType: String&lt;/div&gt;&lt;div&gt;-toasted: boolean&amp;nbsp;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-9">
          <mxGeometry y="26" width="260" height="84" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-11" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-9">
          <mxGeometry y="110" width="260" height="8" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-12" value="+getSummary()&lt;div&gt;+addMeat()&lt;/div&gt;&lt;div&gt;+addCheese()&lt;/div&gt;&lt;div&gt;+addTopping()&lt;/div&gt;&lt;div&gt;+getVaule&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-9">
          <mxGeometry y="118" width="260" height="100" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-35" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.25;entryY=1;entryDx=0;entryDy=0;" edge="1" parent="1" source="Wyr9WAor4eIPkShxo9wc-13" target="Wyr9WAor4eIPkShxo9wc-33">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-13" value="Drink" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="20" y="400" width="160" height="120" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-14" value="-name: String" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-13">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-15" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-13">
          <mxGeometry y="52" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-16" value="+ getName:String&lt;div&gt;+getVaule&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-13">
          <mxGeometry y="60" width="160" height="60" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-17" value="Classname" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="710" y="650" width="160" height="60" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-19" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-17">
          <mxGeometry y="26" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-20" value="+ method(type): type" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-17">
          <mxGeometry y="34" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-21" value="Ingredient" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="640" y="380" width="180" height="178" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-22" value="-name: String&lt;div&gt;-type: String&lt;/div&gt;&lt;div&gt;-extra: boolean&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-21">
          <mxGeometry y="26" width="180" height="64" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-23" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-21">
          <mxGeometry y="90" width="180" height="8" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-24" value="+getVaule" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-21">
          <mxGeometry y="98" width="180" height="80" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-36" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.5;entryY=1;entryDx=0;entryDy=0;" edge="1" parent="1" source="Wyr9WAor4eIPkShxo9wc-25" target="Wyr9WAor4eIPkShxo9wc-33">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-25" value="Chips" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="100" y="620" width="160" height="130" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-26" value="-name: String" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-25">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-27" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-25">
          <mxGeometry y="52" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-28" value="+ getName:String&lt;div&gt;+getVaule&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-25">
          <mxGeometry y="60" width="160" height="70" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-29" value="Sauce" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="440" y="580" width="160" height="140" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-30" value="-name: String" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-29">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-31" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-29">
          <mxGeometry y="52" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-32" value="+ getName:String&lt;div&gt;+getVaule&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="Wyr9WAor4eIPkShxo9wc-29">
          <mxGeometry y="60" width="160" height="80" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-33" value="«interface»&lt;br&gt;&lt;b&gt;GetVaule&lt;/b&gt;" style="html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="350" y="-90" width="110" height="50" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-34" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.064;entryY=1;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="Wyr9WAor4eIPkShxo9wc-5" target="Wyr9WAor4eIPkShxo9wc-33">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-37" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.636;entryY=1;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="Wyr9WAor4eIPkShxo9wc-29" target="Wyr9WAor4eIPkShxo9wc-33">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="Wyr9WAor4eIPkShxo9wc-38" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.909;entryY=0.8;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="Wyr9WAor4eIPkShxo9wc-21" target="Wyr9WAor4eIPkShxo9wc-33">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>







Receipt Generation

Completed orders are saved as .txt files inside a receipts folder.
