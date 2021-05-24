
SUMMARY = "Python implementation of Markdown."
HOMEPAGE = "https://Python-Markdown.github.io/"
AUTHOR = "Manfred Stienstra, Yuri takhteyev and Waylan limberg <python.markdown@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=745aaad0c69c60039e638bff9ffc59ed"

SRC_URI = "https://files.pythonhosted.org/packages/49/02/37bd82ae255bb4dfef97a4b32d95906187b7a7a74970761fca1360c4ba22/Markdown-3.3.4.tar.gz"
SRC_URI[md5sum] = "b6833c6326e9164ee0c662218a75e7f0"
SRC_URI[sha256sum] = "31b5b491868dcc87d6c24b7e3d19a0d730d59d3e46f4eea6430a321bed387a49"

S = "${WORKDIR}/Markdown-3.3.4"

RDEPENDS_${PN} = ""

inherit setuptools3
