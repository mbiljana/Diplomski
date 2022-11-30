import { createElement } from "react";
const React = { createElement };


import { Placeholder } from "mendix/Placeholder";
import { asPluginWidgets, t } from "mendix/native";

import * as styles from "D:/Fakultet IV godina/IV II sem/IIS/mendix/New folder/theme/styles.js";

const { $Placeholder } = asPluginWidgets({ Placeholder });

export const mainContent = (placeholder$Main) => [
    <$Placeholder key="l0.Atlas_UI_Resources.NativePhone_Default.Main"
        $widgetId="l0.Atlas_UI_Resources.NativePhone_Default.Main"
        content={placeholder$Main()} />
];

export const sidebar = (placeholder$Main) => [];

