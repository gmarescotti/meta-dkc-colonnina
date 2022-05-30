
SUMMARY = "Run a subprocess in a pseudo terminal"
HOMEPAGE = "https://github.com/pexpect/ptyprocess"
AUTHOR = "Thomas Kluyver <thomas@kluyver.me.uk>"
LICENSE = "ISC License"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cfdcd51fa7d5808da4e74346ee394490"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/20/e5/16ff212c1e452235a90aeb09066144d0c5a6a8c0834397e03f5224495c4e/ptyprocess-0.7.0.tar.gz"
SRC_URI[md5sum] = "9da200c397cb1752209a6b718b6cfc68"
SRC_URI[sha256sum] = "5c5d0a3b48ceee0b48485e0c26037c0acd7d29765ca3fbb5cb3831d347423220"

S = "${WORKDIR}/ptyprocess-0.7.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
