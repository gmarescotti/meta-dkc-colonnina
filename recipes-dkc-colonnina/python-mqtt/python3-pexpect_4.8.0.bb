
SUMMARY = "Pexpect allows easy control of interactive console applications."
HOMEPAGE = "https://pexpect.readthedocs.io/"
AUTHOR = "Noah Spurrier; Thomas Kluyver; Jeff Quast <noah@noah.org, thomas@kluyver.me.uk, contact@jeffquast.com>"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c7a725251880af8c6a148181665385b"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/e5/9b/ff402e0e930e70467a7178abb7c128709a30dfb22d8777c043e501bc1b10/pexpect-4.8.0.tar.gz"
SRC_URI[md5sum] = "153eb25184249d6a85fde9acf4804085"
SRC_URI[sha256sum] = "fc65a43959d153d0114afe13997d439c22823a27cefceb5ff35c2178c6784c0c"

S = "${WORKDIR}/pexpect-4.8.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-ptyprocess"

BBCLASSEXTEND = "native nativesdk"
