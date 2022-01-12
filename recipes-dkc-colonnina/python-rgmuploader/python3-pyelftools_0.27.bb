
SUMMARY = "Library for analyzing ELF files and DWARF debugging information"
HOMEPAGE = "https://github.com/eliben/pyelftools"
AUTHOR = "Eli Bendersky <eliben@gmail.com>"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ce2a2b07fca326bc7c146d10105ccfc"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/6b/b5/f7022f2d950327ba970ec85fb8f85c79244031092c129b6f34ab17514ae0/pyelftools-0.27.tar.gz"
SRC_URI[md5sum] = "061d67c669a9b1f8d07f28c47fb6a65f"
SRC_URI[sha256sum] = "cde854e662774c5457d688ca41615f6594187ba7067af101232df889a6b7a66b"

S = "${WORKDIR}/pyelftools-0.27"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
