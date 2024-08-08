#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "frb_example_gallery"
DESCRIPTION = "flutter rust bridge example"
AUTHOR = "fzyzcjy"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=480e9b5af92d888295493a5cc7f2238e"

SRCREV = "42f8102622fd6abd1945f2f037e876ee7bc0daae"
SRC_URI = " \
    gitsm://github.com/fzyzcjy/flutter_rust_bridge;lfs=0;nobranch=1;protocol=https;destsuffix=git \
    file://flutter_rust_bridge/0001-gallery-updates.patch \
"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "frb_example_gallery"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "fzyzcjy-flutter-rust-bridge-frb-example-gallery"
FLUTTER_APPLICATION_PATH = "frb_example/gallery"

inherit flutter-app

RDEPENDS:${PN} += " \
    fzyzcjy-flutter-rust-bridge-frb-example-gallery-rust \
"
