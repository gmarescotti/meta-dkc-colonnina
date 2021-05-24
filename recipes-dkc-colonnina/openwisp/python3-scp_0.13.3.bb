
SUMMARY = "scp module for paramiko"
HOMEPAGE = "https://github.com/jbardin/scp.py"
AUTHOR = "James Bardin <j.bardin@gmail.com>"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=fc264c65fb17b7db5237cf7ce1780769"

SRC_URI = "https://files.pythonhosted.org/packages/31/ea/957c864e8f0aafab52edfd18bbaacf342a1935ba3a5cb6b5704a1738ebac/scp-0.13.3.tar.gz"
SRC_URI[md5sum] = "707149e9dbcf17e48b8b50caf262db5d"
SRC_URI[sha256sum] = "8bd748293d7362073169b96ce4b8c4f93bcc62cfc5f7e1d949e01e406a025bd4"

S = "${WORKDIR}/scp-0.13.3"

RDEPENDS_${PN} = ""

inherit setuptools3
