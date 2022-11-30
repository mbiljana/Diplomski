import { createElement } from "react";
const React = { createElement };

import { ExpressionProperty } from "mendix/ExpressionProperty";
import { StyleProperty } from "mendix/StyleProperty";

import { Container } from "mendix/Container";
import { Text } from "mendix/Text";
import { asPluginWidgets, t } from "mendix/native";

import { mainContent, sidebar } from "D:/Fakultet IV godina/IV II sem/IIS/mendix/New folder/deployment/native/layouts/Atlas_UI_Resources.NativePhone_Default.js";

import * as styles from "D:/Fakultet IV godina/IV II sem/IIS/mendix/New folder/theme/styles.js";

const { $Container, $Text } = asPluginWidgets({ Container, Text });

const placeholder$Main = () => [
    <$Container key="p0.MyFirstModule.Home_Native.container1"
        $widgetId="p0.MyFirstModule.Home_Native.container1"
        style={StyleProperty({
            styles: [ styles.Container, styles.spacingInnerTopLarge, styles.spacingInnerBottomLarge, styles.spacingInnerLeftMedium, styles.spacingInnerRightMedium ]
        })}
        onClick={undefined}
        content={[
            <$Text key="p0.MyFirstModule.Home_Native.text2"
                $widgetId="p0.MyFirstModule.Home_Native.text2"
                style={StyleProperty({
                    styles: [ styles.Text, styles.TextHeading3 ]
                })}
                text={t([
                    ExpressionProperty({
                        expression: { "expr": { "type": "literal", "value": "Welcome to your new app" }, "args": {} }
                    })
                ])} />
        ]} />
];

export const placeholder$Header = () => null;

export const $$title = t([
    "Home"
] );

export const $$style = [ styles.Layout, styles.Page ];

export const $$page = () => mainContent(placeholder$Main);

export const $$sidebar = () => sidebar(placeholder$Main);

